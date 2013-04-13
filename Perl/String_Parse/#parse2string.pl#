#!usr/bin/perl -w
use strict;
use warnings;
#String 1
my $inStringLength1 = 0;
my $inStringNextCharTemp1;
my $inStringNextCharIndex1 = 0;
my $inString1 = "";
my @parse1;
my $parseIndex1 = 0;

#String 2
my $inStringLength2 = 0;
my $inStringNextCharTemp2;
my $inStringNextCharIndex2 = 0;
my $inString2 = "";
my @parse2;
my $parseIndex2 = 0;

#Input the strings from console
print "Input first string";
chomp($inString1 = <STDIN>);
print "\n";
print
chomp($inString2 = <STDIN>);

#Parse first string
while($inStringNextCharIndex1 <= $inStringLength1){
	$inStringLength1 = length($inString1);
	$inStringNextCharTemp1 = substr($inString1, $inStringNextCharIndex1, 1);
	$inStringNextCharIndex1++;
	@parse1 = (@parse1, $inStringNextCharTemp1);
    } 

#Parse second string
while($inStringNextCharIndex2 <= $inStringLength2){
	$inStringLength2 = length($inString2);
	$inStringNextCharTemp2 = substr($inString2, $inStringNextCharIndex2, 1);
	$inStringNextCharIndex2++;
	@parse2 = (@parse2, $inStringNextCharTemp2);
    }

print "Operation Complete\n";
print @parse1;
print "\n";
print @parse2;

