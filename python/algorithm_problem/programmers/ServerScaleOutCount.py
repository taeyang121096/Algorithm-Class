def answer(players, m, k):
    server_add = [p // m for p in players]

    for i in range(len(server_add)):
        current = server_add[i]
        if current > 0:
            limit = min(i + k, len(server_add))
            for j in range(i + 1, limit):
                updated_value = server_add[j] - current
                server_add[j] = max(updated_value, 0)

    return sum(server_add)

if __name__ == "__main__":
    players = [0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5]
    m = 3
    k = 5

    print(answer(players, m, k))