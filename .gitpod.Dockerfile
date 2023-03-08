FROM gitpod/workspace-full
RUN sudo apt-get update
RUN mkdir ~/.fonts
RUN wget https://github.com/IdreesInc/Monocraft/releases/download/v2.5/Monocraft.ttf -P ~/.fonts/
RUN sudo rm -rf /var/lib/apt/lists/*