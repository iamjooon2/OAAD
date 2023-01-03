init = '어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.'
recursive_init = '"재귀함수가 뭔가요?"'
recursive_sentence_1 = '"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.'
recursive_sentence_2 = '마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.'
recursive_sentence_3 = '그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."'
recursive_answer = '"재귀함수는 자기 자신을 호출하는 함수라네"'
recursive_finish = '라고 답변하였지.'
under_bars = "____"

def recursive(i: int, N: int):
    print(under_bars * i + recursive_init)
    if i == N:
        print(under_bars * i + recursive_answer)
    else:
        print( under_bars * i + recursive_sentence_1)
        print( under_bars * i + recursive_sentence_2)
        print( under_bars * i + recursive_sentence_3)
        recursive(i+1, N)
    print(under_bars * i + recursive_finish)

N = int(input())
print(init)
recursive(0, N)