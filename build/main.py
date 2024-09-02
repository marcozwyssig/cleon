# main.py
from invoke import Collection, Context
from tasks import download_and_extract_ant

def main():
    # Create a collection and add tasks to it
    ns = Collection()
    ns.add_task(download_and_extract_ant, 'download_and_extract_ant')

    # Create a context to pass to tasks
    ctx = Context()

    # Execute the download_file task
    download_and_extract_ant(ctx)
    
if __name__ == '__main__':
    main()
