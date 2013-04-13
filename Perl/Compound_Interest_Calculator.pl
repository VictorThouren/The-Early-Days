#!usr/bin/perl 
use warnings;
use strict;

print "Begin program: compound_interest_calculator\n\n";

#Initiate Variables
my $principal = 0;
my $interestRate = 0;
my $compoudRate = 0;
my $years = 0;
my $result = 0;
my $num = 0;
my $exp = 0;

#-------------------------|
#-Collect input from user-|
#-------------------------|

print "Enter principal amount:\n "; #Principal
chomp($principal = <STDIN>);

print "Enter interest rate as decimal:\n "; #Interest Rate
chomp($interestRate = <STDIN>);

print "Enter the number of times the interest is compounded per year:\n "; #Compound Rate
chomp($compoundRate = <STDIN>);

print "Enter the number of years that the investment will mature:\n "; #Years
chomp($years = <STDIN>);

#------------------|
#-Calculate Result-|
#------------------|

$result = ($principal * (1 + ($interestRate / $compoundRate)))**($compoundRate * $years)

#---------------|
#-Output Result-|
#---------------|

print "At the of $years years\n ";
print "your initial investment of \$$principal\n ";
print "will have grown to \$$result\n ";



#-------------|
#-End Program-|
#-------------|



