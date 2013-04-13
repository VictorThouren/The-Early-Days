use strict;
use warnings;

#Initialize Variables
my $guess = 50;
my $counter = 0;
my $input = 0;
my $floor = 0;
my $ceiling = 100;
my $nextGuess = 0;
my $guessDifference = 0;

while($input ne "c")
{
    print"My guess is $guess\n";
    print" is this high(h), low(l), or correct(c)";
    chomp($input = <STDIN>);
    
    if($input eq "l")#Execute if guess is too low
    {
        $floor = $guess;    
        $nextGuess = ($floor + $ceiling) / 2;
        $guessDifference = $nextGuess - $guess;
        $guess = int($nextGuess);
    }
    elsif($input eq "h")#Execute if guess is too high
    {
        $ceiling = $guess;
        $nextGuess = ($floor + $ceiling) / 2;
        $guessDifference = $nextGuess - $guess;
        $guess = int($nextGuess);
    }
    $counter++
}
print"\n\n";                            #Output the correct guess
print "Your number is: $guess\n";       
print "That took me $counter guesses\n\n"



