my $number = 0;
my $sum = 0;
my $mod3 = 1;
my $mod5 = 1;
while($number < 1000){
$mod3 = $number % 3;
$mod5 = $number % 5;
if($mod3 == 0 || $mod5 == 0){$sum = $sum + $number;}
$number++;
}
print $sum;
print "\n";
