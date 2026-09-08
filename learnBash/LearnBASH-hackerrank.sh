## Learn BASH script -- hackerrank 
## Last update = 6 sept

: << 'EOF'
-----
insights from learning 
1. there is virtually no index positioning (tab) in bash code 
2. always use $[varname] to input a variable to a ouput
    - used for FORMATTED PRINT 
3. there is NO ";" at the end of line in bash 
4. use "fi" at the end of IF statement
    structure =>
        if ((condition)); then 
        fi
    q6
5. use "done" at the end of FOR loop
    q4
6. use esac at the end of CASE
    q7
7. "read" is executed for every input LINE 
8. "OR" in bash == "||" 
9. "bc" role => to do DECIMAL and exponent that normal bash cant do 
    q9
10. printf in Bash doesnt have "()"
11. do not add any SPACE around "="
-----
EOF 



## q1,, simple echo 
echo "hello world"

## q2, simple loops in bash 
    ### task = use FOR loops to display ODD natural number from 1 to 99
#!/bin/bash // this line is sort of optional but in hackerrank it wont be considered 
for (( i=1; i<=99; i+=2)) # format => startPosition[i], conditionOf[i], increment[i] 
do 
    echo $i 
done 

## q3 -- accepts "name" as input and displays the greeting "Welcome (name)"
read name 
echo "Welcome $name"

## q4 -- FOR condition 
for (( i = 1; i<=50 ;i+=1))
do 
    echo $i
done 


## q5 -- process and print on same line 
read x 
read y 
echo $((x+y))
echo $((x-y))
echo $((x*y))
echo $((x/y))


## q6 -- IF condition -- identify bigger or less or equal
read X
read Y  
if ((X > Y)); then 
    echo "X is greater than Y"
elif (( X < Y )); then
    echo "X is less than Y"
else
    echo "X is equal to Y"
fi

## q7 -- use of CASE for multiple if at once -- read a SIngle Char, return if 
read char
case $char in 
    [Yy]) echo -e "YES";; #Yy means big Y and small y; 
        # the ")" acts similarly to ":"
    [Nn]) echo -e "NO";;
esac 

## q8 -- triangle scalene, isosceles, or equilateral
# to print welcome text and accept input at the SAME time => read X
read X 
read Y 
read Z 

if (( X == Y && Y == Z )); then
    echo "EQUILATERAL"
elif (( X == Y || Y == Z || X == Z )); then
    echo "ISOSCELES"
else
    echo "SCALENE"
fi

## q9 read input char by char in one input line (basically a long mixed operation counting) -- but NOT using LOOP but using "bc" statement 
    # sample input => (-105.5*7+50*3)/20 + (19^2)/7
    # sample output => 22.146
    # "bc" role => to do DECIMAL and exponent that normal bash cant do 
read expr 
result=$(echo "scale=10; $expr" | bc -l) # IMPORTANT in this line -> do not add any SPACE around "="
printf "%.3f\n" "$result" # round to 3 decimal places 

## q10 -- given an KNOWN (first line) number N integers, computer average, round to 3 decimal place
read N 
sum=0


