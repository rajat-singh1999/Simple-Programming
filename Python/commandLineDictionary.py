import json

word = input("Enter the word you want to search: ").lower()

jsonFile = open("data _copy.json")

dictionary = json.load(jsonFile)
jsonFile.close()

try:
	print(dictionary[word][0])
except:
	print("No such word in the dictionary.")
	inp = input("Do you want to add this word to the dictionary?(y/n)")
	if inp == "y":
		jsonFile = open("data _copy.json")
		dictionary = json.load(jsonFile)
		mean = input(f"Write the meaning of {word}: ")
		newMean = [mean]
		new_dict = {**dictionary, **{word: newMean}} 
		jsonFile.close()
		
		f = open("data _copy.json", "w")
		f.write(new_dict)
		f.close()
		
		jsonFile = open("data _copy.json")
		
		dictionary = json.load(jsonFile)
		print(dictionary[word][0])
		jsonFile.close()
		
		

