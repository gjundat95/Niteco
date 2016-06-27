func greet(day:Int, lastname:String, firstname:String) -> String{
	return "Hello \(lastname) \(firstname), number is \(day)"
} 
//greet("Bod",day:"Monday")
// print(greet(9,lastname:"Ngo",firstname:"Tinh"))

func calculateStatics(scores: [Int]) -> (min:Int,max:Int,sum:Int){

	var min = scores[0]
	var max = scores[0]
	var sum = 0

	for score in scores {
		if score > max {
			max = score
		}
		if score < min {
			min = score
		}
		sum += score
	}
	return (min,max,sum)
}
let statics = calculateStatics([1,4,5,7,8,99,0]);
// print(statics)
// print(statics.sum)
// print(statics.0)

func sumOf(numbers : Int ...) -> Int {
	var sum = 0;
	for number in numbers {
		sum += number
	}
	return sum
}
// sumOf()
// let sum = sumOf(1,2,3,4,5,6)
// print(sum)

func returnFifteen() -> Int {
	var y = 10
	func add() {
		y += 5
	}
	add()
	return y
}

// let fifteen = returnFifteen()
// print(fifteen)

func makeIncmeter() -> ((Int) -> Int) {
	func addOnce(number:Int) -> Int{
		return 1 + number
	}
	return addOnce
}

// let make = makeIncmeter()

// print(make(78))

func hasAnyMatches(list : [Int], condition: (Int) -> Bool) -> Bool {

	for item in list {
		if condition(item) {
			return true
		}
	}
	return false
 }

 func lessThanTen(number :Int) -> Bool {
 	return number < 10
 }

 let numbers = [20, 19, 0, 12, 13]
 // print( hasAnyMatches(numbers,condition: lessThanTen) )

// let demo = numbers.map({
//     (nu: Int) -> Int in
//     if nu % 2 != 0 {
//     	return 0
//     }
//     return nu
// })
// print(demo)

// let mappedNumbers = numbers.map({ number in 3 * number })
 // print(mappedNumbers)
// let sortNumber = sorted(numbers, {$0 > $1})
// print(sortNumber)


// let sortedNumbers = sorted(numbers, sortFunc)
// let reversed = sorted(numbers, { s1, s2 in s1 > s2 } )
