import random as ran
class Dice:
	def build(side):
		if side == 1:
			print("[-----]\n[     ]\n[  0  ]\n[     ]\n[-----]")
		elif side == 2:
			print("[-----]\n[     ]\n[ 0 0 ]\n[     ]\n[-----]")
		elif side == 3:
			print("[-----]\n[  0  ]\n[  0  ]\n[  0  ]\n[-----]")
		elif side == 4:
			print("[-----]\n[ 0 0 ]\n[     ]\n[ 0 0 ]\n[-----]")
		elif side == 5:
			print("[-----]\n[ 0 0 ]\n[  0  ]\n[ 0 0 ]\n[-----]")
		else:
			print("[-----]\n[ 0 0 ]\n[ 0 0 ]\n[ 0 0 ]\n[-----]")


while(True):
	inp = input("Press y to roll the dice: ")
	
	r = ran.randint(1, 6)
	Dice.build(r)
	
	if (inp != "y") and (inp != "Y"):
		print("Simulator shutdown.")
		break



