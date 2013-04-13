use warnings;
use strict;

my $name = "";
my @name = "";
my $sum = 0;

print "Enter name: ";
chomp($name = <STDIN>);
@name = split(//, $name);

foreach $name(@name){
	$name = lc($name);
	my $scope = " abcdefghijklmnopqrstuvwxyz";
	$sum = $sum + index($scope, $name,);
	}
print "\n";
print $sum;
