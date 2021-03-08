class Parser:

  ##### Parser header #####
  def __init__(self, scanner):
    self.next_token = scanner.next_token
    self.token = self.next_token()

  def take_token(self, token_type):
    if self.token.type != token_type:
      self.error("Unexpected token: %s" % token_type)
    if token_type != 'EOF':
      self.token = self.next_token()

  def error(self,msg):
    raise RuntimeError('Parser error, %s' % msg)

  ##### Parser body #####

  # Starting symbol
  def start(self):
    # start -> program EOF
    if self.token.type == 'version:' or self.token.type == 'services:' or self.token.type == 'build:' or self.token.type == 'environment:' or self.token.type == 'networks:' or self.token.type == 'volumes:':
      self.program()
      self.take_token('EOF')
    else:
      self.error("Epsilon not allowed")

  def program(self):
    # program -> keyword program
    if self.token.type == 'version:' or self.token.type == 'services:' or self.token.type == 'build:' or self.token.type == 'environment:' or self.token.type == 'networks:' or self.token.type == 'volumes:' or self.token.type == 'image:' or self.token.type == 'deploy:' or self.token.type == 'ports:':
      self.keyword()
      self.program()
    # program -> eps
    else:
      pass

  def keyword(self):
    # keyword -> services_keyword
    if self.token.type == 'services:':
      self.take_token('services:')
      self.services()
    # keyword -> version_keyword 
    elif self.token.type == 'version:':
      self.take_token('version:')
      self.version()
    # keyword -> volumes_keyword
    elif self.token.type == 'volumes:':
      self.take_token('volumes:')
      self.volumes()
    # keyword -> networks_keyword
    elif self.token.type == 'networks:':
      self.take_token('networks:')
      self.networks()
    else:
      self.error("Epsilon not allowed")

  def services(self):
    # services_keyword -> WORD services_keyword 
    if self.token.type == 'WORD':
      self.take_token('WORD')
      self.services()
    else:
      print("Services OK")

  def volumes(self):
    # volumes_keyword -> WORD
    if self.token.type == 'WORD':
      self.take_token('WORD')
      print("Volumes OK")
    else:
      self.error("Epsilon not allowed")
    
  def networks(self):
    # networks_keyword -> WORD
    if self.token.type == 'WORD':
      self.take_token('WORD')
      print("Networks OK")
    else:
      self.error("Epsilon not allowed")

  def version(self):
    # version_keyword -> VERSION
    if self.token.type == 'VERSION':
      self.take_token('VERSION')
      print("Version OK")
    else:
      self.error("Epsilon not allowed")
  
  def value(self):
    # value -> NUMBER
    if self.token.type == 'NUMBER':
      self.take_token('NUMBER')
    # value -> ID
    elif self.token.type == 'ID':
      self.take_token('ID')
    else:
      self.error("Epsilon not allowed")
       