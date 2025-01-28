class Vehicle:
    def __init__(self, vehicle_id, vehicle_type, driver_name=None, status="Available"):
        self.vehicle_id = vehicle_id
        self.vehicle_type = vehicle_type
        self.driver_name = driver_name
        self.status = status

    def assign_driver(self, driver_name):
        self.driver_name = driver_name
        print(f"Driver {self.driver_name} has been assigned to vehicle {self.vehicle_id}.")

    def update_status(self, status):
        self.status = status
        print(f"Vehicle {self.vehicle_id} status updated to {self.status}.")

# Creating and managing vehicles
vehicle1 = Vehicle("V123", "Bus")
vehicle1.assign_driver("John Doe")
vehicle1.update_status("In Use")
