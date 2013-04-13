use warnings;
use strict;

my $scope = " abcdefghijklmnopqrstuvwxyz";
my $search = " ";
my $output = " ";

print "Input Char: ";
chomp($search = <STDIN>);

$output = index($scope, $search,);

print "\n";
print $scope;
print "\n";
print $search;
print "\n";
print $output;
print "\n";
