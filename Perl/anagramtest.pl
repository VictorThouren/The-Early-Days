use warnings;
use strict;

#Initialize Variables
my $string1 = "";
my $string2 = "";

#Collect user input
print "\nInput first word: ";
chomp($string1 = <STDIN>);
print "\nInput second word: ";
chomp($string2 = <STDIN>);

#Strip NEWLINE and Whitespace chars
$string1 =~ s/\s//g;
$string2 =~ s/\s//g;

#Expand both strings into char arrays
my @array1 = split(//, $string1);
my @array2 = split(//, $string2);

#Sort both strings into alpha order
@array1 = sort @array1;
@array2 = sort @array2;

#Convert both char arrays back to scalar strings
$string1 = join(@array1);
$string2 = join(@array2);

#Test to see if both match
if($string1 eq $string2){print"\nIs anagram\n";}
if($string1 ne $string2){print"\nNot anagram\n";}




