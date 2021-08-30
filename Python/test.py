def fun(*args, **kwargs):
    st = ''
    [print(i) for i in a]
    print("Meet some honorary mentions:")
    [print(f"{key} is {value}") for key, value in kwargs.items()]

a = ["Rajat", "Raja", "Bikas", "Narendar", "Amitesh", "Sangharsh"]
b = {"Rajat": "Late Comer", "Bikas": "Slow learner", "Narendar": "Politician"}
fun(*a, **b)