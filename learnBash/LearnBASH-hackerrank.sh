## Learn BASH script -- hackerrank 
## Last update = 6 sept

: << 'EOF'
-----
insights from learning 
1. there is virtually no index positioning (tab) in bash code 
2. always use $[varname] to input a variable to a ouput

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

## q4
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


## q6 -- identify bigger or less or equal 
