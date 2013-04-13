use warnings;
use strict;

my $alpha = "_abcdefghijklmnopqrstuvwxyz";
my $alphaTemp = "";
my $alphaIndex = 1;
my $inChar = "";
my $inCharIndex = "";
my $solved = "false";
my $result = "";
my $counter = 0;
my $temp = "";

print"\nEnter Character: "; #Input Character
chomp($inChar = <STDIN>);  #From Console

while($solved eq "false")
{
	$alphaTemp = substr($alpha, $alphaIndex, 1);

	if($inChar eq $alphaTemp)
	{
		$result = substr($alpha, $alphaIndex + 1, 1);
		$solved = "true";	
	}
	elsif($inChar ne $alphaTemp)
	{
		if($inChar eq 'z')
		{
  		$result = 'a'; 
		$solved = "true";
		}
		else
		{
		$alphaIndex++;
		}
	}
	$counter++;
}
print"\n\n";
print"alphaTemp: $alphaTemp\n";
print"alphaIndex: $alphaIndex\n";
print"counter: $counter\n";
print"\nResult: $result\n";
print"\n\nPress enter to continue...";
chomp($temp = <STDIN>);
