### IBM Model M 102 - Windows / Linux layout
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
  
  # 
  # LALT           LGUI 
  # LCTRL          LALT
  CAPS_LOCK      LGUI

  # 
  PAD_ASTERIX    PAD_MINUS

  # Fix Numpad 
  PAD_PLUS       PAD_ENTER            
  SCROLL_LOCK    PAD_ASTERIX
  EXTRA_SYSRQ    PAD_MINUS
  PAD_MINUS      PAD_PLUS
  NUM_LOCK       PAD_SLASH
  ESC            NUM_LOCK
  
  
  F7             MEDIA_PREV_TRACK 
  F8             MEDIA_PLAY_PAUSE 
  F9             MEDIA_NEXT_TRACK 
  F10            MEDIA_MUTE 
  F11            MEDIA_VOLUME_DOWN
  F12            MEDIA_VOLUME_UP  
  F23            PRINTSCREEN
  F24            SCROLL_LOCK
  LANG_4         PAUSE

  
  # Hijack the f-keys for media controls
  F13            ESC
endblock

ifset set3 
ifkeyboard any
ifselect any
remapblock
layer 1
  F7             F7
  F8             F8
  F9             F9
  F10            F10
  F11            F11
  F12            F12
  CAPS_LOCK      CAPS_LOCK
endblock
