import gym # to import gym package
env = gym.make('CartPole-v0') # to load the cart pole game
env.reset() # to reset the environment
for _ in range(1000): # a for loop to do random step
    env.render()
    env.step(env.action_space.sample()) # take a random action
env.close() # close