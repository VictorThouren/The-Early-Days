use warnings;
use strict;

my $input = "";
my @chars = ("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
my $output = "";
my @nums = ("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27");

#Request and accept input from user
print "Enter Character: ";
chomp($input = <STDIN>);

$input = ($input =~ tr/@chars/@nums/);

$output = $input;

print @chars;
print"\n";
print @nums;
print"\n";
print $input;
print"\n";

