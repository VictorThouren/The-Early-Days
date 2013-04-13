#!usr/bin/env perl
use strict;
use warnings;

my $num1 = 0;
my $num2 = 0;
my $change = 0;

#Input Data From User
print"\nEnter first number: ";
chomp($num1 = <STDIN>);
print"\nEnter second number: ";
chomp($num2 = <STDIN>);

#Calculate and output result
if($num1 > $num2){$change = $num1 / $num2;}
 elsif($num2 > $num1){$change = $num2 / $num1;}
 
print"There is a percent change of $change between the two values entered";

