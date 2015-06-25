### IBM Model M 101 - OS X 

ifset set3
layerblock
  FN1          1
  FN2          1      # One for each hand, where available
  FN1 FN2      2      # Press them both for a hard to reach second layer
endblock

remapblock
ifset set3
layer 0
  CAPS_LOCK        FN1                # Function Key

  # PAD_ASTERIX    FN2                # And the second one: currently the same
  # PAD_PLUS       PAD_ENTER          # Puts an enter at the far right edge
  LALT           LGUI               # Command!
  # RALT           RGUI               # And again !
  # LCTRL          LALT
  # RCTRL          RALT

  # Fix Numpad
  SCROLL_LOCK    PAD_ASTERIX
  EXTRA_SYSRQ    PAD_MINUS
  PAD_MINUS      PAD_PLUS
  PAD_ASTERIX    PAD_PLUS
  NUM_LOCK       PAD_SLASH

  # Hijack the f-keys for media controls
  F1           F14                # Brightness down
  F2           F15                # Brightness up
  F3           F11                # Exposé
  F4           F12                # Dashboard

  F7           MEDIA_PREV_TRACK   # Playback
  F8           MEDIA_PLAY_PAUSE   # 
  F9           MEDIA_NEXT_TRACK   # 

  F10          MEDIA_MUTE 
  F11          MEDIA_VOLUME_DOWN  # Volume
  F12          MEDIA_VOLUME_UP
 
 
  # Hijack the f-keys for media controls
  # F13            ESC
  F16            MEDIA_VOLUME_DOWN  # Volume
  F17            MEDIA_VOLUME_UP
  F18            MEDIA_PREV_TRACK   # Playback
  F19            MEDIA_NEXT_TRACK   # 
  F20            MEDIA_PLAY_PAUSE   # 
endblock



# Primary Function Layer: HHKB + ESDF Arrows
# the layer itself is just some remaps tagged with the layer number
remapblock
# Just for the PC/XT keyboard
ifset set1
layer 1
  # HHKB Arrows
  LEFT_BRACE   UP
  SEMICOLON    LEFT
  SLASH        DOWN
  QUOTE        RIGHT
  L            PAGE_UP
  PERIOD       PAGE_DOWN
  K            HOME
  COMMA        END
  H            PAD_ASTERIX
  J            PAD_SLASH
  N            PAD_PLUS
  M            PAD_MINUS

  #    ESDF Arrows   
  E            UP
  S            LEFT
  D            DOWN
  F            RIGHT
  R            PAGE_UP
  V            PAGE_DOWN
  A            HOME
  G            END

  #    Restore the Numpad   
  PAD_1        PAD_1
  PAD_2        PAD_2
  PAD_3        PAD_3
  PAD_4        PAD_4
  PAD_5        PAD_5
  PAD_6        PAD_6
  PAD_7        PAD_7
  PAD_8        PAD_8
  PAD_9        PAD_9
  PAD_PLUS     PAD_PLUS
  PAD_PERIOD   PAD_PERIOD
  PAD_0        PAD_0

  #    Restore the Function Keys   
  F1           F1
  F2           F2
  F3           F3
  F4           F4
  F5           F5
  F6           F6
  F7           F7
  F8           F8
  F9           F9
  F10          F10
  F11          F11
  F12          F12

  #    Media keys across the number row   
  1            F14               # Decrease Display Brightness 
  2            F15               # Increase Display Brightness
  3            F10               # Exposé: All App Windows
  4            F12               # Dashboard
  5            F11               # Exposé: Show Desktop
  6            F9                # Exposé: All Windows in All Apps
  7            MEDIA_PREV_TRACK  # iTunes / media playback controls
  8            MEDIA_PLAY_PAUSE
  9            MEDIA_NEXT_TRACK
  0            MEDIA_MUTE        # Volume controls
  MINUS        MEDIA_VOLUME_DOWN
  EQUAL        MEDIA_VOLUME_UP
  BACKSPACE    DELETE            # Delete for Backspace
  LCTRL        CAPS_LOCK         # Capslock lives, out of harm's way
  ENTER        PAD_ENTER         # Enter for Return
  ESC          EUROPE_2          # This § symbol - which is now missing from layer 0
  BACK_QUOTE   EUROPE_2          # In both places I might look for it
endblock
