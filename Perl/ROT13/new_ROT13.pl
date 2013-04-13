use warnings;
use strict;

my @alpha=("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
my @sample1 = ("a","b","c","d","e","f","g","h","i","j","k","l","m");
my @sample2 = ("n","o","p","q","r","s","t","u","v","w","x","y","z");

my $input = "";
my @workingWhore;

#PARSE CONTROL VARIABLES
my $inStringLength1 = 0;
my $inStringNextCharTemp1;
my $inStringNextCharIndex1 = 0;
my $parseIndex1 = 0;


print"|------------------------|\n";
print"|-ROT-13 Encoder/Decoder-|\n";
print"|------------------------|\n";

print"\n\nEnter the input string: ";
chomp($input = <STDIN>);

while($inStringNextCharIndex1 <= $inStringLength1){
	$inStringLength1 = length($input);
	$inStringNextCharTemp1 = substr($input, $inStringNextCharIndex1, 1);
	$inStringNextCharIndex1++;
	@workingWhore = (@workingWhore, $inStringNextCharTemp1);
    } 
    
 

print @workingWhore;
print  "\n\n";
print $input;
