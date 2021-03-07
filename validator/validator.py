from scanner import *
from parserr import *

#input_string = '''
#x := 5;
#y := x;
#PRINT 64;
#'''

input_string = '''
 PRINT x;
    IF quantity THEN
        total := total;
        tax := 0.05;
    ENDIF;
'''

print(input_string)
scanner = Scanner(input_string)
print(scanner.tokens)

parser = Parserx(scanner)
parser.start()
  