
def str = "at\t\t\t\t\t"

def m = str =~ /\t/

//count は Groovy の拡張で Java には groupCount() しかない
println "count : ${m.count}, group count: ${m.groupCount()}"

while(m.find()) {
	println "$m"
}
