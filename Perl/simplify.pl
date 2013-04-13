#The purpose of this script is to simplify equations
#into a y=ax+b form
	
use warnings;
use strict;

	
my @equationLeft;
my @equationRight;
my $input = 0;
my $solved = "false";
my $equalsOffset = 0; 


	
print"Enter equation: "; #Reads base equation 
chomp($input = <STDIN>); #from user


	
#######################################
#print"Input was $input";#TEST COMMAND#
####################################### 
	
exit;
	
#The script will now find the position
#of the "=" operator in the equation
while($solved ne "true")
{
	
	my $inTemp="";#Initialize substr control variables
	my $inIndex=0;
	my $inLength; 
	

	$inLength = length($input);
	$inTemp= substr($input, $inIndex, 1);

	if($inTemp eq "=")
	{
		$equalsOffset = $inIndex;
		$solved = "true";
	}
	elsif($inTemp ne "=")
	{
		if($inIndex == $inLength)
		{
			print"Equation has no equal operator, operation aborted";
			
		}
		$inIndex++;
	}
}
print 'equalsOffset is $equalsOffset';

	

		
