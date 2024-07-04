# main.py
from invoke import Collection, Program, Context
from tasks import create_dest_dir, download_file

def main():
    # Create a collection and add tasks to it
    ns = Collection()
    ns.add_task(create_dest_dir, 'create_dest_dir')
    ns.add_task(download_file, 'download_file')

    # Create a context to pass to tasks
    ctx = Context()

    # Execute the download_file task
    create_dest_dir(ctx)
    download_file(ctx)
    
if __name__ == '__main__':
    main()
