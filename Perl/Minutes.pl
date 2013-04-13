#!usr/bin/perl
use strict;
use warnings;

#Declare Variables#
my $month;
my $day;
my $minutes;
my $totdays;

#Read in user input
print "Enter date(mm/dd): ";
chomp($month = <STDIN>);
print ", ";
chomp($day = <STDIN>);
print "\n";

#Calculate and output data
$totdays = ($month - 1) * 30 + $day;
$minutes = $totdays * 1440;
print "It has been $minutes minutes since the start of the year.\n"







