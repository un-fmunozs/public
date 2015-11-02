### IBM Model M 102 - OS X layout
### P/N 1395665 
ifset set3
layerblock
  FN1          1
  FN2          1      # One for each hand, where available
  FN1 FN2      2      # Press them both for a hard to reach second layer
endblock

remapblock
ifset set3
layer 0
  # Function Key Right Control
  RCTRL          FN1                  
  # Function Key F2
  LANG_4         FN2

  # Command
  LALT           LGUI 
  #LCTRL          LALT
  CAPS_LOCK      LALT

  # Fix Numpad for OS X
  PAD_PLUS       PAD_ENTER            
  SCROLL_LOCK    PAD_SLASH
  EXTRA_SYSRQ    PAD_ASTERIX
  PAD_MINUS      PAD_PLUS
  PAD_ASTERIX    PAD_MINUS
  NUM_LOCK       PAD_EQUALS
  ESC            DELETE

  # Hijack the f-keys for media controls
  F1           F14                # Brightness down
  F2           F15                # Brightness up
  F3           F11                # Exposé
  F4           F12                # Dashboard
  # F5 
  # F6
  F7           MEDIA_PREV_TRACK   # Playback
  F8           MEDIA_PLAY_PAUSE   # 
  F9           MEDIA_NEXT_TRACK   # 
  F10          MEDIA_MUTE 
  F11          MEDIA_VOLUME_DOWN  # Volume
  F12          MEDIA_VOLUME_UP
  F13          ESC
endblock

ifset set3 
ifkeyboard any
ifselect any
remapblock
layer 1
  F1 F1
  F2 F2
  F3 F3
  F4 F4
  F5 F5
  F6 F6
  F7 F7
  F8 F8
  F9 F9
  F10 F10
  F11 F11
  F12 F12
  LALT LALT
endblock