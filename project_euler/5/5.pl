use warnings;
use strict;

my $solution=0;
my $canidate=1;
my @range=(1 .. 20);
my $test=0;
my $sum=0;
my $mod=1;

for($canidate=1; $canidate < 99999; $canidate++){
	for($test=1;$test<21;$test++){
		$mod=$canidate%$test;
		if($mod==0){$sum=$sum++;}
	}
	if($sum==21){print $canidate;}
}
print "\n End";
print $canidate;

	
