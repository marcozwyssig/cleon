# main.py
from invoke import Collection, Program, Context
from tasks import download_and_extract_eclipse

def main():
    # Create a collection and add tasks to it
    ns = Collection()
    ns.add_task(download_and_extract_eclipse, 'download_and_extract_eclipse')

    # Create a context to pass to tasks
    ctx = Context()

    # Execute the download_file task
    download_and_extract_eclipse(ctx)
    
if __name__ == '__main__':
    main()
