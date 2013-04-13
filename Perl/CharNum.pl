use warnings;
use strict;

my $alpha = "abcdefghijklmnopqrstuvwxyz"
my $alphaTemp = "";
my $alphaIndex = 1;
my $inChar = "";
my $inCharIndex = "";
my $solved = "false";
my $result = "";
my $counter = 0;

print"\nEnter Character: "; 
chomp($inChar = <STDIN>);  

while($solved eq "false")
{
	$alphaTemp = substr($alpha, $alphaIndex, 1)

	if($inChar eq $alphaTemp)
	{
		$result = substr($alpha, $alphaIndex + 1, 1);
		$solved = "true";	
	}
	elsif($inChar !eq $alphaTemp)
	{
		$alphaIndex++;
	}
	$counter++
}
print"\n\n";
print"alphaTemp: $alphaTemp";
print"alphaIndex: $alphaIndex";
print"counter: $counter";

print"\nResult: $result\n";
		
