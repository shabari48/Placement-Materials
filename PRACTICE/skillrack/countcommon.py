# Python3 code to count number of matching 
# characters in a pair of strings 

# Function to count the matching characters 
def count(str1, str2) : 

	c = 0; j = 0; 

	# Traverse the string 1 char by char 
	for i in range(len(str1)) :

	 
		if str1[i] in str2 : 
			c += 1; 
		
		j += 1; 
	
	print("No. of matching characters are: ", c ); 


# Driver code 
if __name__ == "__main__" :
	str1 = "22";
	str2 = "22222";
	
	count(str1, str2); 
	
# This code is contributed by AnkitRai01
