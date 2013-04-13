use warnings;
use strict;
my$m=0;my$d=0;
my$y=0;my$t=0;my$w=0;
my@m=(0,1,4,4,0,2,5,0,3,6,1,4,6);
my@w=("Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday");

print"Enter month: ";
chomp($m=<STDIN>);
print"Enter day: ";
chomp($d=<STDIN>);
print"Enter year: ";
chomp($y=<STDIN>);

$t=$t+int($y/4); #A
$t=$t+$y; #B
$t=$t+$d; #C
$t=$t+$m[$m]; #D
if($y%4==0&&$m==1||$m==2){$t=$t-1;} #E
$w=$w[($t%7)]; #F

print"Day of week is $w";








