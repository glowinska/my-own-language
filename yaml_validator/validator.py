from scanner import *
from parserr import *

#input_string = '''
#x := 5;
#y := x;
#PRINT 64;
#'''

input_string = '''
version: "3.9"

services:
  wordpress:
    image: wordpress
    ports:
      - "8080:80"
    networks:
      - overlay
    deploy:
      mode: replicated
      replicas: 2
      endpoint_mode: vip

  mysql:
    image: mysql
    volumes:
       - db-data:/var/lib/mysql/data
    networks:
       - overlay
    deploy:
      mode: replicated
      replicas: 2
      endpoint_mode: dnsrr

volumes:
  db-data:

networks:
  overlay:
'''

print(input_string)
scanner = Scanner(input_string)
print(scanner.tokens) 

parser = Parser(scanner)
parser.start()
