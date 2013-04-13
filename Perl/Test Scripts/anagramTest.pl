use warnings;
use strict;

#--------------------------------
#Program: Anagram Test
#This program will take two
#strings from the console and
#output whether they consist of
#the same characters
#--------------------------------
#Control Data
my $alpha = "abcdefghijklmnopqrstuvwxyz";
my $letter = undef;
my $solved = "false";
my $length = undef;
my $temp = undef;
my $alphaIndex = 1;
#String One Data
my $string1 = undef;
my @string1 = undef;
my $value1 = 0;
#String Two Data
my $string2 = undef;
my @string2 = undef;
my $value2 = 0;
#Accept first string from console   
print"Enter the first line: ";      
chomp($string1 = <STDIN>);                                                                   
#Accept second string from console  
print"\nEnter the second line: ";   
chomp($string2 = <STDIN>);          
#---------------------|
#-Start Data Analysis-|
#---------------------|
#Parse First String into array
$length = length($string1);
while($alphaIndex <= $length){
    $temp = substr($string1,$alphaIndex,1);
    $alphaIndex++;
    @string1=(@string1,$temp);
    }
#Parse Each Letter In The First String And Assign A Value To It
foreach $temp(@string1){
    $alphaIndex = 1; 
    while($solved eq "false"){
        $letter = substr($alpha,$alphaIndex,1)
        if($temp eq $letter){
            $value1 = $value1 + $alphaIndex;
            $solved = "true";
            }
        elsif($temp ne $letter){
            $alphaIndex++;
            }
#Reset Variable Control Data
$solved = "false";
$alphaIndex = 1;
#Parse Second String Into Array
$length = length($string2);
while($alphaIndex <= $length){
    $temp = substr($alpha,$alphaIndex,1);
    $alphaIndex++;
    @string2=(@string2,$temp);
    }
#Parse Each Letter In The Second String And Assign A Value To It
foreach $temp(@string2){
    $alphaIndex = 1;
    while($solved eq "false"){
        $letter = substr($alpha,$alphaIndex,1)
        if($temp eq $letter){
            $value2 = $value2 + $alphaIndex;
            $solved = "true";
            }
        elsif($temp ne $letter){
            $alphaIndex++;
            }
	}
#-------------------|
#-End Data Analysis-|
#-------------------|
#Output Results
if($value1==$value2){
    print"\nThe lines are an anagram\n";
    }
elsif($value1!=$value2){
    print"\nThe lines are not a anagram\n";
    }
print"\n\nPress enter to continue...";

