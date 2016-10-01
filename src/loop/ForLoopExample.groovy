for(def i=0; i<=5; i++){
	println "Value of i = ${i}"
} 

def j = 1
while(j<=9){
	println "Value of j = ${j}"
	j++
} 

Object[] list1 = [1,3,5,6,"sat"]
println list1.class

for(Object i : list1){
	println "Print the value of i ${i}"
}
