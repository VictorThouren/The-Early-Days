use warnings;
use strict;

my @answer = (" ");
my $answerIndex = 0;


#Reads in '
my $input1 = open(Wordlist, <~/code/HackThisSite/'Level 1'/WordList.txt>);
my @WordList = readline(Wordlist);

#Reads in 'TestWords.txt' and converts it to an array.
my $input2 = open(TestWordsFile, <~/code/HackThisSite/'Level 1'/TestWords.txt>);
my @TestWords = readline(TestWordsFile);

#The first nested 'foreach' loop will parse each word in @TestWords
#into an array and then sort that array into alphabetical order.
foreach my $string1(@TestWords){

	#Strip NEWLINE and whitespace characters from '$string1'
	$string1 =~ s/\s//g;   

	#convert '$string1' into a character array
   	my @string1 = split(//, $string1);
	
	#sort '@string1' into alphabetical order
	@string1 = sort(@string1);

	#Convert '@string1' back into a scalar string 
	my $testString1 = join(@string1);

	
	#The first nested 'foreach' loop will parse each word in @WordList
	#into an array and then sort that array into alphabetical order.
	foreach my $string2(@WordList){

		#Strip NEWLINE and whitespace characters from '$string2'
		$string2 =~ s/\s//g; 

		#Convert '$string2' into a character array
		my @string2 = split(//, $string2);
		
		#Sort '@string2 into alphabetical order
		@string2 = sort(@string2);
		
		#Convert '@string2' back into a scalar string 
		my $testString2 = join(@string2);

		#Compare '@string1' and '@string2', if they are the same
		#same then '@string2 will be added to '@answer' under the 
		#appropriate index value
		
		if($testString1 eq $testString2){
			@answer = (@answer, $testString2);
			}
		}
	}

print"@answer\n\n";
print"@TestWords\n\n";

