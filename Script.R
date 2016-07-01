setwd("c:/Users/19846/ProjetoPEE/")
require("ggplot2")


#====================================================================================

resultWindows <-read.csv(file = "resultados.csv", header = T, sep = ",", dec = ".")

# média simples

d <- resultWindows[resultWindows$carga == 1000000 & resultWindows$tipo == "random",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

d <- resultWindows[resultWindows$carga == 1000000 & resultWindows$tipo == "inverso",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

d <- resultWindows[resultWindows$carga == 1000000 & resultWindows$tipo == "ordenado",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

#==================================5000000========================================

d <- resultWindows[resultWindows$carga == 5000000 & resultWindows$tipo == "random",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

d <- resultWindows[resultWindows$carga == 5000000 & resultWindows$tipo == "inverso",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

d <- resultWindows[resultWindows$carga == 5000000 & resultWindows$tipo == "ordenado",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

#==================================10000000========================================

d <- resultWindows[resultWindows$carga == 10000000 & resultWindows$tipo == "random",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

d <- resultWindows[resultWindows$carga == 10000000 & resultWindows$tipo == "inverso",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))

d <- resultWindows[resultWindows$carga == 10000000 & resultWindows$tipo == "ordenado",]
print(paste("Média",mean(d$tempo), sep = " "))
print(paste("Mediana",median(d$tempo), sep = " "))
print(paste("Média harmonica",1/mean(1/d$tempo), sep = " "))
print(paste("amplitude",max(d$tempo) - min(d$tempo), sep = " "))
print(paste("Variancia", var(d$tempo),sep = " "))
print(paste("Desvio-padrao", sd(d$tempo), sep = " "))
print(paste("Coeficiente de variação", sd(d$tempo)/mean(d$tempo) * 100, sep = " "))