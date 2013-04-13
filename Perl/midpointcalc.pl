use warnings;
use strict;

#Initialize Variables
my $X1 = 0;
my $X2 = 0;
my $Y1 = 0;
my $Y2 = 0;
my $Xout = "";
my $Yout = "";

#Take luser input
print"X1 = ";
chomp($X1 = <STDIN>);
print "\nX2 = ";
chomp($X2 = <STDIN>);
print "\nY1 = ";
chomp($Y1 = <STDIN>);
print"\nY2 = ";
chomp($Y2 = <STDIN>);

#Calculate Result
$Xout = ($X1 + $X2) / 2;
$Yout = ($Y1 + $Y2) / 2;

#Return Result
print"\n\nThe midpoint of $X1, $Y1 and $X2,$Y1 is $Xout,$Yout";

 
