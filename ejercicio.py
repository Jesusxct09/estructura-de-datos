def findEle(arr, l, h, targetValue):
    # Se busca directamente porque el arreglo original no está ordenado.
    for i in range(l, h + 1):
        if arr[i] == targetValue:
            return i

    return -1


if __name__ == "__main__":
    InputArr = [12, 34, 10, 6, 40, 89, 98, 57, 19, 69]
    targetElement = int(input("Ingrese el elemento a buscar: "))

    s = len(InputArr)
    idx = findEle(InputArr, 0, s - 1, targetElement)

    if idx != -1:
        print("El elemento se encuentra en la posicion: " + str(idx + 1))
    else:
        print("El elemento no se encuentra en el arreglo")
