use warnings; 
use strict;

my $test = " Front\n Middle End t";
print "$test \n";

$test =~ s/\s//g;  

print "$test \n";
