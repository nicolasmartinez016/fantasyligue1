import urllib.request
import urllib.parse
import re



def getGame(game):
    lUrl = 'https://www.whoscored.com/Matches/1076103/Live'
    #lUrl = lUrl + str(game)
    values = {'s':'basics', 'submit':'search'}
    data = urllib.parse.urlencode(values)
    data = data.encode('utf-8')
    req = urllib.request.Request(lUrl, data)
    resp = urllib.request.urlopen(req)
    respData = resp.read()
    print(str(respData))
    paragraph = re.findall(r'var matchCentreData{(.*?)}', str(respData))
    print("paragraph : \n", paragraph)

    #for eachP in paragraph:
        
    



(getGame(81829))
