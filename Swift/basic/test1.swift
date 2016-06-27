// Contructor Array 
var arr = ["tinh","tu","linh"]
arr[1] = "tinh 2"

var arr1 = [
	"tinh":"hai duong",
	"tu":"thai nguyen",
]
arr1["linh"] = "quang ninh"

// Empty Array
var arr2 = [String]()
var arr3 = [String:Float]()

// Array ba dao
var interestingArray = [
	"Prime":[1,2,3,4,5],
	"Fibonaci":[1,1,3,5,8],
	"Core":[1,10,0,7,3,4]
]
var largest = 0
for (kind,numbers) in interestingArray{
	for number in numbers {
		if number > largest {
			largest  = number
		}
	}
}
print(largest)

var total = 0
for i in 1..<4{
	total += 1
}
print(total)