import datetime
import time

weather = "bad"
enablelaunch  = False

def log(text): #prints text passed to it with a timestamp in front
    print(str(datetime.datetime.now()) + " " + text)
    
def countdown(n):  #counts down to 0 in seconds from the integer passed to it.
    for x in range (n, 0, -1):
        log("T- " + str(x))
        time.sleep(1)     

def getWeather():
    weather = input('Weather? good/bad')
    return weather
    
def getLaunch():
    goforlaunch = input('Go for Launch? True/False')
    return goforlaunch

def main():
    while True:
        enableLaunch = getLaunch()
        weather = getWeather()
        if weather == "good" and enableLaunch:
            launch = True
        else:
            launch = False
        if launch:
            log("Go for laucnh")
            countdown(3)
            log("BLASTOFF!!!")
        else:
            print("No launch")
        
main()
