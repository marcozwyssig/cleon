from abc import abstractmethod
from config import Config

class AbstractCommand:
    def __init__(self, config: Config):
        self.config = config

    @abstractmethod
    def execute(self):
        raise NotImplementedError("The execute method must be implemented by a subclass.")