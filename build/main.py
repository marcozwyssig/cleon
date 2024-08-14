# main.py
from invoke import Collection, Program, Context
from tasks import package_eclipse

def main():
    # Create a collection and add tasks to it
    ns = Collection()
    ns.add_task(package_eclipse, 'package_eclipse')

    # Create a context to pass to tasks
    ctx = Context()

    # Execute the download_file task
    package_eclipse(ctx)
    
if __name__ == '__main__':
    main()
