/*
 * some ways to define array
 */
def array1 = new String[3]
String array2 = ['dog', 'cat', 'goat']
def array3 = ['sun', 'moon', 'stars'] as String[]

println array1
println array2
println array3

array1[0] = "jack"
println array1