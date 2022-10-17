#!/bin/sh

ant coverage

# Invoke cp_coverage_report.sh if present and executable
if [ -f cp_coverage_report.sh ]; then
  if [ -x cp_coverage_report.sh ]; then
    ./cp_coverage_report.sh
  else
    echo "Found cp_coverage_report.sh but it is not executable (run chmod +x cp_coverage_report.sh)"
  fi
fi
