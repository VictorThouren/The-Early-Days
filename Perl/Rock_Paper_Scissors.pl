#!usr/bin/env perl
use strict;
use warnings;

my $usrMove
my $compMove

$compMove = int(rand(3));
if($compMove == 1){$compMove = "r";
if($compMove == 2){$compMove = "p";
if($compMove == 3){$compMove = "s";


print"\nEnter move(r/p/s): ";
chomp($usrMove = <STDIN>);

if($usrMove eq "r")
{
    if($compMove eq "r")
    {
        print"Computer picked rock";
        print"Tie\n";
    }
    elsif($compMove eq "p")
    {
        print"Computer picked paper";
        print"Computer Wins\n";
    }
    elsif($compMove eq "s")
    {
        print"Computer picked scissors";
        print"User Wins\n";
    }
}
elsif($usrMove eq "p")
{
    if($compMove eq "r")
    {
        print"Computer picked rock";    
        print"User Win\n";
    }
    elsif($compMove eq "p")
    {
        print"Computer picked paper";
        print"Tie\n";
    }
    elsif($compMove eq "s")
    {
        print"Computer picked scissors";
        print"Computer Win\n";
    }
}
elsif($usrMove eq "s")
{
    if($compMove eq "r")
    {
        print"Computer picked rock";    
        print"Computer Wins\n";
    }
    elsif($compMove eq "p")
    {
        print"Computer picked paper";
        print"User Wins\n";
    }
    elsif($compMove eq "s")
    {
        print"Computer picked scissors";
        print"Tie\n"
    }
}
    
