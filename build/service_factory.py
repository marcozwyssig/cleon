import abc
import pinject

# Step 1: Define the interface using abc
class ServiceInterface(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def perform_action(self):
        pass

# Step 2: Implement the interfaces
class ServiceA(ServiceInterface):
    def perform_action(self):
        return "Service A action"

class ServiceB(ServiceInterface):
    def perform_action(self):
        return "Service B action"

class ServiceC(ServiceInterface):
    def perform_action(self):
        return "Service C action"

# Step 3: Create the factory class
class ServiceFactory:
    def __init__(self, service_map):
        self.service_map = service_map

    def get_service(self, service_name):
        service_class = self.service_map.get(service_name)
        if not service_class:
            raise ValueError(f"No service found for name: {service_name}")
        return service_class

# Step 4: Set up the Pinject binding
class ServiceBindingSpec(pinject.BindingSpec):
    def provide_service_map(self):
        return {
            'service_a': ServiceA,
            'service_b': ServiceB,
            'service_c': ServiceC
        }

    def configure(self, bind):
        # Bind interfaces to their implementations
        bind(ServiceInterface, to_class=ServiceA)  # Example binding for interface

# Step 5: Use Pinject to create an instance of the factory
obj_graph = pinject.new_object_graph(binding_specs=[ServiceBindingSpec()])
service_factory = obj_graph.provide(ServiceFactory)

# Example usage:
service_name = "service_a"
service_instance = service_factory.get_service(service_name)
print(service_instance.perform_action())  # Output: Service A action
