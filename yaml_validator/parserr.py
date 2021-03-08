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
  
  def value(self):
    # value -> NUMBER
    if self.token.type == 'NUMBER':
      self.take_token('NUMBER')
    # value -> ID
    elif self.token.type == 'ID':
      self.take_token('ID')
    else:
      self.error("Epsilon not allowed")
       