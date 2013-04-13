#!C:\Perl\bin\perl
use warnings;
use strict;

#----------------|
#-ROT-13 Encoder-|
#----------------|

my $sample1="abcdefghijklm"; #Alphabet
my $sample2="nopqrstuvwxyz"; #ROT13 Offset

my $inputString="";
my $inStringLength=0;
my $intemp=" ";
my @output;
my $done="false";
my $offset = 1;
my $insample="0";
my $knowsample="false";

print"|------------------------|\n";
print"|-ROT-13 Encoder/Decoder-|\n";
print"|------------------------|\n";

print"Enter the input string: ";
chomp($inputString = <STDIN>);

while ($done eq "false"){
	
	$intemp = substr($inputString, $offset, 1);
	
	while($knowsample eq "true"){ #This loop will find out with sample contains the same letter as $intemp	
		if($intemp eq
			"a"||"b"||"c"||"d"||"e"||"f"||
			"g"||"h"||"i"||"j"||"k"||"l"||"m"
			){$insample = "1";}
		if($intemp eq
			"n"||"o"||"p"||"q"||"r"||"s"||
			"t"||"u"||"v"||"w"||"x"||"y"||"z"
			){$insample = "2";}
	}
	if($insample eq "1"){
