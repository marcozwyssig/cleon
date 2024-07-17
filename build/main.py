# main.py
from invoke import Collection, Program, Context
from tasks import install_eclipse_components

def main():
    # Create a collection and add tasks to it
    ns = Collection()
    ns.add_task(install_eclipse_components, 'install_eclipse_components')

    # Create a context to pass to tasks
    ctx = Context()

    # Execute the download_file task
    install_eclipse_components(ctx)
    
if __name__ == '__main__':
    main()
